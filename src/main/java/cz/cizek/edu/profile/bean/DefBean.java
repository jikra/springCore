package cz.cizek.edu.profile.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
@Service
@Profile("default")
public class DefBean {

    public DefBean() {
        System.out.println("DefBean created");
    }
}
