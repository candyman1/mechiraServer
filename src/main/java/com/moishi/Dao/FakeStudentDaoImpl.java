package com.moishi.Dao;

import java.util.HashMap;
import java.util.Map;
import com.moishi.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements FakeStudentDaoImp {
    private static Map<String,Student>students;

    static{
        students= new HashMap<String,Student>(){
            {
                put("moishi", new Student("moishi", "Moshe", "Rosenberg", "18 Oceanside",
                        "Lakewood", "NJ", "555-5555", "1", "", "1", "", "",
                        "", "1", "1", "1", "", "1", "", "",
                        "", "", "", "", "", "", "",
                        "", "", "", "", "", "",
                        "", "1", "", "", "", "",
                        "", "", "", "1", "", "", "", "",
                        "", "1", "1", "", "", "",
                        "", "", "", "", "", "", "",
                        "1", "", "", "", "", "", "", "",
                        "1", "", "", "300", "", "1", "18 Oceanside", "",
                        "", "", "1", "study", "", ""

                ));

            }

    };}
    @Override
    public Collection <Student>getAllStudents(){
        return this.students.values();
    }
    @Override
    public  Student getStudentById(String id){
return this.students.get(id);
    }

    @Override
    public void removeStudentById(String id) {
        this.students.remove(id);
    }

    public FakeStudentDaoImpl() {
    }

    @Override
    public void updateStudent(Student student){

        Student s= students.get(student.getId());
        s.setFirstName(student.getFirstName());
        s.setLastName(student.getLastName());
        s.setAddress(student.getAddress());
        s.setCity(student.getCity());
        s.setState(student.getState());
        s.setPhone(student.getPhone());
        s.setAttic(student.getAttic());
        s.setBathCab(student.getBathCab());
        s.setBasement(student.getBasement());
        s.setBriefcase(student.getBriefcase());
        s.setBreakfront(student.getBreakfront());
        s.setCloset(student.getCloset());
        s.setCrawl(student.getCrawl());
        s.setDrawer(student.getDrawer());
        s.setFreezer(student.getFreezer());
        s.setGarage(student.getGarage());
        s.setGrill(student.getGrill());
        s.setKitCab(student.getKitCab());
        s.setLiqCab(student.getLiqCab());
        s.setMedChest(student.getMedChest());
        s.setPantry(student.getPantry());
        s.setFridge(student.getFridge());
        s.setShed(student.getShed());
        s.setStorage(student.getStorage());
        s.setOtherPlace(student.getOtherPlace());
        s.setCarBox(student.getCarBox());
        s.setCarAdd(student.getCarAdd());
        s.setInvestBox(student.getInvestBox());
        s.setInvestAdd(student.getInvestAdd());
        s.setLockerBox(student.getLockerBox());
        s.setLockerAdd(student.getLockerAdd());
        s.setNeighborBox(student.getNeighborBox());
        s.setNeighborAdd(student.getNeighborAdd());
        s.setOfficeAdd(student.getOfficeAdd());
        s.setOfficeBox(student.getOfficeBox());
        s.setFridgeBox(student.getFridgeBox());
        s.setFridgeAdd(student.getFridgeAdd());
        s.setOtherBox(student.getOtherBox());
        s.setOtherAdd(student.getOtherAdd());
        s.setZone(student.getZone());
        s.setBaking(student.getBaking());
        s.setBaked(student.getBaked());
        s.setBarley(student.getBarley());
        s.setBeer(student.getBeer());
        s.setCereal(student.getCereal());
        s.setCond(student.getCond());
        s.setCos(student.getCos());
        s.setCracker(student.getCracker());
        s.setFrozenItem(student.getFrozenItem());
        s.setGroceries(student.getGroceries());
        s.setLiquor(student.getLiquor());
        s.setMeds(student.getMeds());
        s.setMix(student.getMix());
       s.setNoodle(student.getNoodle());
       s.setOatmeal(student.getOatmeal());
       s.setPerfumes(student.getPerfumes());
       s.setPetFood(student.getPetFood());
       s.setPickles(student.getPickles());
       s.setPlaydough(student.getPlaydough());
        s.setToil(student.getToil());
        s.setVita(student.getVita());
        s.setWheatG(student.getWheatG());
        s.setUtensil(student.getUtensil());
        s.setAppliance(student.getAppliance());
        s.setBakingTool(student.getBakingTool());
        s.setToys(student.getToys());
        s.setBooks(student.getBooks());
        s.setSeforim(student.getSeforim());
        s.setEtc(student.getEtc());
        s.setInclude(student.getInclude());
        s.setValue(student.getValue());
        s.setHome(student.getHome());
        s.setKeyBox(student.getKeyBox());
        s.setKeyAdd(student.getKeyAdd());
        s.setCombBox(student.getCombBox());
        s.setCombAdd(student.getCombAdd());
        s.setFullBedika(student.getFullBedika());
        s.setExcludeBox(student.getExcludeBox());
        s.setExcludeAdd(student.getExcludeAdd());
        s.setMiniBox(student.getMiniBox());
        s.setMiniAdd(student.getMiniAdd());

        students.put(student.getId(),student);
    }

    @Override
    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(),student);
    }
}
