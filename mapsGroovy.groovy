    def map = [name : "Dusan"];
    map["age"] = 22;
    map.city = "Kragujevac";

    println(map);

    def hobbyKey = "hobby";
    def hobbyMap = [(hobbyKey) : "Watching sports"];
    map.putAll(hobbyMap);
    println(map);

    def shortMap = map.minus(name : "Dusan", city : "Kragujevac");
    println(shortMap);
    shortMap.removeAll{x -> x.value instanceof String}
    println(shortMap);
    shortMap.removeAll{x -> x.value == 22}
    println(shortMap);

    
