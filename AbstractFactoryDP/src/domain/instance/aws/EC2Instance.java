/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.instance.aws;

import domain.instance.Instance;
import domain.storage.Storage;

/**
 *
 * @author urosv
 */
public class EC2Instance extends Instance{

    public EC2Instance(Capacity capacity) {
        System.out.println("Created " + this.getClass().getSimpleName());
    }
    
}
