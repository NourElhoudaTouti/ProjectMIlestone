package com.example.projectmiltone.Data.Entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Brand extends BaseEntity{
    @NotNull
    private String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
   // @OrderBy("name asc")
    private List<Trip> trips;

    protected Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the products
     */
    public List<Trip> getTrips() {
        return trips;
    }

    /**
     * @param products the products to set
     */
    public void setTrips(List<Trip> products) {
        this.trips = products;
    }
}
