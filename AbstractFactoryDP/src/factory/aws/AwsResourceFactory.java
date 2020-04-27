/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.aws;

import domain.instance.Instance;
import domain.instance.aws.EC2Instance;
import domain.storage.Storage;
import domain.storage.aws.S3Storage;
import factory.ResourceFactory;

/**
 *
 * @author urosv
 */
public class AwsResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new S3Storage(capacityInMb);
    }
    
    
    
}
