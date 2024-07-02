package com.lxisoft ;

public class Restaurant {
    private Chef chef ;

    public Restaurant(Chef chef)
    {
        this.chef = chef ;
    }

    /**
     * @param chef the chef to set
     */
    public void setChef(Chef chef) {
        this.chef = chef;
    }

    /**
     * @return the chef
     */
    public Chef getChef() {
        return chef;
    }

    public void prepareMeal()
    {
        chef.cook() ;
    }

}