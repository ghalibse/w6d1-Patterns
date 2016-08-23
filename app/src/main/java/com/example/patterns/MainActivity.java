package com.example.patterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.patterns.Observer.ObserverHelper;
import com.example.patterns.factory.AnimalFactory;
import com.example.patterns.factory.Fish;
import com.example.patterns.factory.Mammal;
import com.example.patterns.singleton.Tiger;

import rx.Observable;
import rx.Observer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tiger tigerTono = Tiger.getInstance();
        tigerTono.eat();

        Tiger tigerTigger = Tiger.getInstance();
        tigerTigger.eat();

        AnimalFactory animalFactory = new AnimalFactory();

        Fish fishNemo = animalFactory.createFish();
        fishNemo.swim();

        Fish fishDory = animalFactory.createFish();
        fishDory.swim();

        Mammal mammalDumbo =  animalFactory.createMammal();
        mammalDumbo.run();

        Mammal mammalSimba = animalFactory.createMammal();
        mammalSimba.run();

        Observer<String> observer  = ObserverHelper.createObserver();
        Observable<String> observable = ObserverHelper.createObservable();

        observable.subscribe(observer);

    }
}
