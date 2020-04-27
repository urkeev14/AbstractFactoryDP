/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.instance;

import domain.storage.Storage;

/**
 *
 * @author urosv
 */
public abstract class Instance {

    public enum Capacity {
        micro, small, large
    }

    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    public void atachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to " + this.getClass().getSimpleName());
    }

    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stopped");
    }

}
