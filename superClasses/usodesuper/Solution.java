package usodesuper;
class God {
    public static Human[] create(){
        Man adam = new Man("Adam");
        Woman eve = new Woman("Eve");
        return new Human[]{ adam, eve };    
    }
}

class Human {
  //Name attribute  
  String name;

    // Constructor
    public Human(String name) {
        this.name = name;
    }

    //Get
    public String getName() {
        return name;
    }
}

class Man extends Human {
    public Man(String name){
        super(name); // Llamada al constructor de la clase padre
    }
}

class Woman extends Human {
    public Woman(String name){
        super(name); // Llamada al constructor de la clase padre
    }
}
