/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import domain.instance.Instance;
import domain.storage.Storage;

/**
 *
 * @author urosv
 */
public interface ResourceFactory {
    
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capacityInMb);
    
}
