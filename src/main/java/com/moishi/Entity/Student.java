package com.moishi.Entity;



public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String phone;
    private String attic;
    private String basement;
    private String bathCab;
    private String breakfront;
    private String briefcase;
    private String closet;
    private String crawl;
    private String drawer;
    private String freezer;
    private String garage;
    private String grill;
    private String kitCab;
    private String liqCab;
    private String medChest;
    private String pantry;
    private String fridge;
    private String shed;
    private String storage;
    private String otherPlace;
    private String carBox;
    private String carAdd;
    private String investBox;
    private String investAdd;
    private String lockerBox;
    private String lockerAdd;
    private String neighborBox;
    private String neighborAdd;
    private String officeBox;
    private String officeAdd;
    private String fridgeBox;
    private String fridgeAdd;
    private String otherBox;
    private String otherAdd;
    private String zone;
    private String baking;
    private String baked;
    private String barley;
    private String beer;
    private String cereal;
    private String cond;
    private String cos;
    private String cracker;
    private String frozenItem;
    private String groceries;
    private String liquor;
    private String meds;
    private String mix;
    private String noodle;
    private String oatmeal;
    private String perfumes;
    private String petFood;
    private String pickles;
    private String playdough;
    private String toil;
    private String vita;
    private String wheatG;
    private String utensil;
    private String appliance;
    private String bakingTool;
    private String toys;
    private String books;
    private String seforim;
    private String etc;
    private String include;
    private String value;
    private String home;
    private String keyBox;
    private String keyAdd;
    private String combBox;
    private String combAdd;
    private String fullBedika;
    private String excludeBox;
    private String excludeAdd;
    private String miniBox;
    private String miniAdd;







    public Student(){

    }

    public Student(String id, String firstName, String lastName, String address, String city, String state,
                   String phone, String attic, String basement, String bathCab, String breakfront, String briefcase,
                   String closet, String crawl, String drawer, String freezer, String garage, String grill,
                   String kitCab, String liqCab, String medChest, String pantry, String fridge, String shed,
                   String storage, String otherPlace, String carBox, String carAdd, String investBox,
                   String investAdd, String lockerBox, String lockerAdd, String neighborBox, String neighborAdd,
                   String officeBox, String officeAdd, String fridgeBox, String fridgeAdd, String otherBox,
                   String otherAdd, String zone, String baking, String baked, String barley, String beer,
                   String cereal, String cond, String cos, String cracker, String frozenItem, String groceries,
                   String liquor, String meds, String mix, String noodle, String oatmeal, String perfumes,
                   String petFood, String pickles, String playdough, String toil, String vita, String wheatG,
                   String utensil, String appliance, String bakingTool, String toys, String books, String seforim,
                   String etc, String include, String value, String home, String keyBox, String keyAdd,
                   String combBox, String combAdd, String fullBedika, String excludeBox, String excludeAdd,
                   String miniBox, String miniAdd) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.attic = attic;
        this.basement = basement;
        this.bathCab = bathCab;
        this.breakfront = breakfront;
        this.briefcase = briefcase;
        this.closet = closet;
        this.crawl = crawl;
        this.drawer = drawer;
        this.freezer = freezer;
        this.garage = garage;
        this.grill = grill;
        this.kitCab = kitCab;
        this.liqCab = liqCab;
        this.medChest = medChest;
        this.pantry = pantry;
        this.fridge = fridge;
        this.shed = shed;
        this.storage = storage;
        this.otherPlace = otherPlace;
        this.carBox = carBox;
        this.carAdd = carAdd;
        this.investBox = investBox;
        this.investAdd = investAdd;
        this.lockerBox = lockerBox;
        this.lockerAdd = lockerAdd;
        this.neighborBox = neighborBox;
        this.neighborAdd = neighborAdd;
        this.officeBox = officeBox;
        this.officeAdd = officeAdd;
        this.fridgeBox = fridgeBox;
        this.fridgeAdd = fridgeAdd;
        this.otherBox = otherBox;
        this.otherAdd = otherAdd;
        this.zone = zone;
        this.baking = baking;
        this.baked = baked;
        this.barley = barley;
        this.beer = beer;
        this.cereal = cereal;
        this.cond = cond;
        this.cos = cos;
        this.cracker = cracker;
        this.frozenItem = frozenItem;
        this.groceries = groceries;
        this.liquor = liquor;
        this.meds = meds;
        this.mix = mix;
        this.noodle = noodle;
        this.oatmeal = oatmeal;
        this.perfumes = perfumes;
        this.petFood = petFood;
        this.pickles = pickles;
        this.playdough = playdough;
        this.toil = toil;
        this.vita = vita;
        this.wheatG = wheatG;
        this.utensil = utensil;
        this.appliance = appliance;
        this.bakingTool = bakingTool;
        this.toys = toys;
        this.books = books;
        this.seforim = seforim;
        this.etc = etc;
        this.include = include;
        this.value = value;
        this.home = home;
        this.keyBox = keyBox;
        this.keyAdd = keyAdd;
        this.combBox = combBox;
        this.combAdd = combAdd;
        this.fullBedika = fullBedika;
        this.excludeBox = excludeBox;
        this.excludeAdd = excludeAdd;
        this.miniBox = miniBox;
        this.miniAdd = miniAdd;
    }
    public String getFrozenItem() {
        return frozenItem;
    }

    public void setFrozenItem(String frozenItem) {
        this.frozenItem = frozenItem;
    }

    public String getGroceries() {
        return groceries;
    }

    public void setGroceries(String groceries) {
        this.groceries = groceries;
    }

    public String getLiquor() {
        return liquor;
    }

    public void setLiquor(String liquor) {
        this.liquor = liquor;
    }

    public String getMeds() {
        return meds;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAttic() {
        return attic;
    }

    public void setAttic(String attic) {
        this.attic = attic;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getBathCab() {
        return bathCab;
    }

    public void setBathCab(String bathCab) {
        this.bathCab = bathCab;
    }

    public String getBreakfront() {
        return breakfront;
    }

    public void setBreakfront(String breakfront) {
        this.breakfront = breakfront;
    }

    public String getBriefcase() {
        return briefcase;
    }

    public void setBriefcase(String briefcase) {
        this.briefcase = briefcase;
    }

    public String getCloset() {
        return closet;
    }

    public void setCloset(String closet) {
        this.closet = closet;
    }

    public String getCrawl() {
        return crawl;
    }

    public void setCrawl(String crawl) {
        this.crawl = crawl;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getFreezer() {
        return freezer;
    }

    public void setFreezer(String freezer) {
        this.freezer = freezer;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getGrill() {
        return grill;
    }

    public void setGrill(String grill) {
        this.grill = grill;
    }

    public String getKitCab() {
        return kitCab;
    }

    public void setKitCab(String kitCab) {
        this.kitCab = kitCab;
    }

    public String getLiqCab() {
        return liqCab;
    }

    public void setLiqCab(String liqCab) {
        this.liqCab = liqCab;
    }

    public String getMedChest() {
        return medChest;
    }

    public void setMedChest(String medChest) {
        this.medChest = medChest;
    }

    public String getPantry() {
        return pantry;
    }

    public void setPantry(String pantry) {
        this.pantry = pantry;
    }

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getShed() {
        return shed;
    }

    public void setShed(String shed) {
        this.shed = shed;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getOtherPlace() {
        return otherPlace;
    }

    public void setOtherPlace(String otherPlace) {
        this.otherPlace = otherPlace;
    }

    public String getCarBox() {
        return carBox;
    }

    public void setCarBox(String carBox) {
        this.carBox = carBox;
    }

    public String getCarAdd() {
        return carAdd;
    }

    public void setCarAdd(String carAdd) {
        this.carAdd = carAdd;
    }

    public String getInvestBox() {
        return investBox;
    }

    public void setInvestBox(String investBox) {
        this.investBox = investBox;
    }

    public String getInvestAdd() {
        return investAdd;
    }

    public void setInvestAdd(String investAdd) {
        this.investAdd = investAdd;
    }

    public String getLockerBox() {
        return lockerBox;
    }

    public void setLockerBox(String lockerBox) {
        this.lockerBox = lockerBox;
    }

    public String getLockerAdd() {
        return lockerAdd;
    }

    public void setLockerAdd(String lockerAdd) {
        this.lockerAdd = lockerAdd;
    }

    public String getNeighborBox() {
        return neighborBox;
    }

    public void setNeighborBox(String neighborBox) {
        this.neighborBox = neighborBox;
    }

    public String getNeighborAdd() {
        return neighborAdd;
    }

    public void setNeighborAdd(String neighborAdd) {
        this.neighborAdd = neighborAdd;
    }

    public String getOfficeBox() {
        return officeBox;
    }

    public void setOfficeBox(String officeBox) {
        this.officeBox = officeBox;
    }

    public String getOfficeAdd() {
        return officeAdd;
    }

    public void setOfficeAdd(String officeAdd) {
        this.officeAdd = officeAdd;
    }

    public String getFridgeBox() {
        return fridgeBox;
    }

    public void setFridgeBox(String fridgeBox) {
        this.fridgeBox = fridgeBox;
    }

    public String getFridgeAdd() {
        return fridgeAdd;
    }

    public void setFridgeAdd(String fridgeAdd) {
        this.fridgeAdd = fridgeAdd;
    }

    public String getOtherBox() {
        return otherBox;
    }

    public void setOtherBox(String otherBox) {
        this.otherBox = otherBox;
    }

    public String getOtherAdd() {
        return otherAdd;
    }

    public void setOtherAdd(String otherAdd) {
        this.otherAdd = otherAdd;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getBaking() {
        return baking;
    }
    public void setBaking(String baking) {
        this.baking = baking;
    }

    public String getBaked() {
        return baked;
    }

    public void setBaked(String baked) {
        this.baked = baked;
    }

    public String getBarley() {
        return barley;
    }

    public void setBarley(String barley) {
        this.barley = barley;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    public String getCereal() {
        return cereal;
    }

    public void setCereal(String cereal) {
        this.cereal = cereal;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    public String getCracker() {
        return cracker;
    }

    public void setCracker(String cracker) {
        this.cracker = cracker;
    }
    public void setMeds(String meds) {
        this.meds = meds;
    }

    public String getMix() {
        return mix;
    }

    public void setMix(String mix) {
        this.mix = mix;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public String getOatmeal() {
        return oatmeal;
    }

    public void setOatmeal(String oatmeal) {
        this.oatmeal = oatmeal;
    }

    public String getPerfumes() {
        return perfumes;
    }

    public void setPerfumes(String perfumes) {
        this.perfumes = perfumes;
    }

    public String getPetFood() {
        return petFood;
    }

    public void setPetFood(String petFood) {
        this.petFood = petFood;
    }

    public String getPickles() {
        return pickles;
    }

    public void setPickles(String pickles) {
        this.pickles = pickles;
    }

    public String getPlaydough() {
        return playdough;
    }

    public void setPlaydough(String playdough) {
        this.playdough = playdough;
    }

    public String getToil() {
        return toil;
    }

    public void setToil(String toil) {
        this.toil = toil;
    }

    public String getVita() {
        return vita;
    }

    public void setVita(String vita) {
        this.vita = vita;
    }

    public String getWheatG() {
        return wheatG;
    }

    public void setWheatG(String wheatG) {
        this.wheatG = wheatG;
    }

    public String getUtensil() {
        return utensil;
    }

    public void setUtensil(String utensil) {
        this.utensil = utensil;
    }
    public String getAppliance() {
        return appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    public String getBakingTool() {
        return bakingTool;
    }

    public void setBakingTool(String bakingTool) {
        this.bakingTool = bakingTool;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getSeforim() {
        return seforim;
    }

    public void setSeforim(String seforim) {
        this.seforim = seforim;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getKeyBox() {
        return keyBox;
    }

    public void setKeyBox(String keyBox) {
        this.keyBox = keyBox;
    }

    public String getKeyAdd() {
        return keyAdd;
    }

    public void setKeyAdd(String keyAdd) {
        this.keyAdd = keyAdd;
    }

    public String getCombBox() {
        return combBox;
    }

    public void setCombBox(String combBox) {
        this.combBox = combBox;
    }

    public String getCombAdd() {
        return combAdd;
    }

    public void setCombAdd(String combAdd) {
        this.combAdd = combAdd;
    }

    public String getFullBedika() {
        return fullBedika;
    }

    public void setFullBedika(String fullBedika) {
        this.fullBedika = fullBedika;
    }

    public String getExcludeBox() {
        return excludeBox;
    }

    public void setExcludeBox(String excludeBox) {
        this.excludeBox = excludeBox;
    }

    public String getExcludeAdd() {
        return excludeAdd;
    }

    public void setExcludeAdd(String excludeAdd) {
        this.excludeAdd = excludeAdd;
    }

    public String getMiniBox() {
        return miniBox;
    }

    public void setMiniBox(String miniBox) {
        this.miniBox = miniBox;
    }

    public String getMiniAdd() {
        return miniAdd;
    }

    public void setMiniAdd(String miniAdd) {
        this.miniAdd = miniAdd;
    }

}


