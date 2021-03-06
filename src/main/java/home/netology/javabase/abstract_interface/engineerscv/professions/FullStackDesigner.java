package home.netology.javabase.abstract_interface.engineerscv.professions;

import home.netology.javabase.abstract_interface.engineerscv.Engineer;
import home.netology.javabase.abstract_interface.engineerscv.skills.ICSS;
import home.netology.javabase.abstract_interface.engineerscv.skills.IDB;
import home.netology.javabase.abstract_interface.engineerscv.skills.IGIT;

public class FullStackDesigner extends Engineer implements ICSS, IDB, IGIT {
    public FullStackDesigner(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void connectDB() {
        System.out.println("Learn different ways to from backend");
    }

    @Override
    public void learnSpecialDB() {

    }

    @Override
    public void learnSQLSyntax() {

    }

    @Override
    public void advancedGit() {

    }
}
