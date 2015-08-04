package com.example.rosterweb;

/**
 * Represents an item in a ToDo list
 */
public class Team {

    /**
     * Item name
     */
    @com.google.gson.annotations.SerializedName("name")
    private String name;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String id;

    /**
     * Team constructor
     */
    public Team() {

    }

    @Override
    public String toString() {
        return getName();
    }

    /**
     * Initializes a new Team
     *
     * @param name
     *            The item name
     * @param id
     *            The item id
     */
    public Team(String name, String id) {
        this.setName(name);
        this.setId(id);
    }

    /**
     * Returns the item name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the item name
     *
     * @param name
     *            name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the item id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Team && ((Team) o).id == this.id;
    }
}