/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.instance.google;

import domain.instance.Instance;
import domain.storage.Storage;

/**
 *
 * @author urosv
 */
public class GoogleComputEngineInstance extends Instance {

    public GoogleComputEngineInstance(Capacity capacity) {
        System.out.println("Created " + this.getClass().getSimpleName());
    }

}
