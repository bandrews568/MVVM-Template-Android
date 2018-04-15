# Kotlin MVVM Template
Used to easily set up an MVVM Kotlin project including UI and unit testing using Android Architecture Components and Dagger 2. **This is meant to be used more as a reference than a starter project. I will be adding more extensions, utility methods, and base classes as needed.**

## Dependency Injection with Dagger 2
###### Dependency injection related classes live in the di package

### Activity Injection
1. Add activity to ActivityBuilderModule
2. Mark the activity for injection in onCreate()   
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this) // Always call before the super class
        super.onCreate(savedInstanceState)
        ...
    }
```
3.  Implement HasSupportFragmentInjector to inject fragments tied to this activity 

### Fragment Injection
1. Add fragment to FragmentBuilderModule
2. Implement Injectable

### View Model
* Use the injected ViewModelFactory when creating a ViewModel
* For fragments the ViewModelFactory in injected in onActivityCreated()

## Testing
### UI with Espresso
###### The TestRunner is used for mocking Dagger 2 injected dependencies in TestApp 
* Test an activity by mocking any objects and methods in activityInjector(). This is very clunky and I'm sure there has to be a better way to do this!
* For fragments use the SingleFragmentActivity to test the fragment in isolation and mock objects and methods as usual

## Unit Testing
*For the most part, you will only use JUnit and Mockito unless you use LiveData in your view model
###### To do: add LiveData test rule

