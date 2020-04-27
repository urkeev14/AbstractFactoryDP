/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.storage.google;

import domain.storage.Storage;

/**
 *
 * @author urosv
 */
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on " + this.getClass().getSimpleName());
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }

}
