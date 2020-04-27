/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.storage.aws;

import domain.storage.Storage;

/**
 *
 * @author urosv
 */
public class S3Storage implements Storage {

    public S3Storage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on " + this.getClass().getSimpleName());
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }

}
