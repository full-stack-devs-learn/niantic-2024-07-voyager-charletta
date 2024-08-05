package com.niantic.part_1_sakila_dtos;

public class Actor
{
    private int actor_id;
    private String firstName;
    private String lastName;


    // then do the blank constructor

     public Actor ( ){}


     public Actor(int actor_id, String firstName, String lastName)
        {
            this.actor_id = actor_id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Integer getActorId(){
           return actor_id;
        }

        public void setActorId(int actor_id) {
            this.actor_id = actor_id;
        }


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // derived getter
        public String getFullName()
        {
            return firstName + " "  + lastName;
        }

        public void setFullName(String fullName)
        {
            String[] parts = fullName.split(" ");
            firstName = parts[0];
            lastName = parts[1];
        }
    }


