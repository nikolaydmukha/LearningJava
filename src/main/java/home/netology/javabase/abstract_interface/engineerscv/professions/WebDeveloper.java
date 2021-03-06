package home.netology.javabase.abstract_interface.engineerscv.professions;

import home.netology.javabase.abstract_interface.engineerscv.Engineer;
import home.netology.javabase.abstract_interface.engineerscv.skills.ICSS;
import home.netology.javabase.abstract_interface.engineerscv.skills.IGIT;
import home.netology.javabase.abstract_interface.engineerscv.skills.IHTML;

public class WebDeveloper extends Engineer implements ICSS, IGIT, IHTML {
    public WebDeveloper(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void advancedGit() {
        System.out.println("Common advanced GIT");
    }
}
