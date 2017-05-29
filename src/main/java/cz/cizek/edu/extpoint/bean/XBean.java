package cz.cizek.edu.extpoint.bean;

/**
 * @author jiricizek <jiri.cizek@cleverlance.com>
 */
public class XBean {

    private String val;

    public XBean(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "XBean{" +
                "val='" + val + '\'' +
                '}';
    }
}
