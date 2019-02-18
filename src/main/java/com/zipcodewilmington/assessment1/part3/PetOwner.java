package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    protected String name;
    protected int age;
    protected ArrayList<Pet> petList = new ArrayList<>();
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;

        if(!(pets == null)) {
            for (Pet pet : pets) {
                this.petList.add(pet);
                pet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.petList.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.petList.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean result = false;

        for (Pet p : this.petList
             ) {
            if(p.equals(pet))
            {
                result = true;
            }
        }
        return result;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngest = 100;

        for (Pet pet : this.petList
             ) {
            if(pet.getAge() < youngest)
            {
                youngest = pet.getAge();
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = 0;

        for (Pet pet : this.petList
             ) {
            if(pet.getAge() > oldest)
            {
                oldest = pet.getAge();
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float avg = 0;
        int ageSum = 0;

        for (Pet pet : this.petList
             ) {
            ageSum += pet.getAge();
        }
        avg = ageSum/getNumberOfPets();

        return avg;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        int numPets = 0;

        for (Pet pet: this.petList
             ) {
            numPets++;
        }
        return numPets;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return petList.toArray(new Pet[petList.size()]);
    }
}
