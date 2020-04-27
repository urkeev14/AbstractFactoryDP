/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.google;

import domain.instance.Instance;
import domain.instance.google.GoogleComputEngineInstance;
import domain.storage.Storage;
import domain.storage.google.GoogleCloudStorage;
import factory.ResourceFactory;
import java.lang.annotation.Annotation;

/**
 *
 * @author urosv
 */
public class GoogleResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new GoogleCloudStorage(capacityInMb);
    }

}
