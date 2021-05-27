package lecture.patterns.templatemethod;

public abstract class Beverage {
    
        void prepareRecipe() {

            
            
            
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
}

    