/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import domain.instance.Instance;
import domain.storage.Storage;
import factory.ResourceFactory;
import factory.aws.AwsResourceFactory;
import factory.google.GoogleResourceFactory;

/**
 *
 * @author urosv
 */
public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        workWithAWSResourceFactory();

        System.out.println("*******************************8");

        workWithGoogleResourceFactory();
    }

    private static void workWithGoogleResourceFactory() {
        Client google = new Client(new GoogleResourceFactory());
        Instance instance2 = google.createServer(Instance.Capacity.large, 40960);
        instance2.start();
        instance2.stop();
    }

    private static void workWithAWSResourceFactory() {
        Client aws = new Client(new AwsResourceFactory());
        Instance instance1 = aws.createServer(Instance.Capacity.micro, 20480);
        instance1.start();
        instance1.stop();
    }

    public Instance createServer(Instance.Capacity capacity, int storageInMb) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageInMb);
        instance.atachStorage(storage);
        return instance;
    }
}
