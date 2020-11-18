package own.code.bean;

public class AirPlane {
    private String fdj;
    private String yc;
    private String num;
    private String jzName;
    private String fjName;

    public AirPlane() {
    }

    public AirPlane(String jzName) {
        this.jzName = jzName;
    }

    public String getFdj() {return fdj;}

    public void setFdj(String fdj) {
        this.fdj = fdj;
    }

    public String getYc() {return yc;}

    public void setYc(String yc) {
        this.yc = yc;
    }

    public String getNum() {return num;}

    public void setNum(String num) {
        this.num = num;
    }

    public String getJzName() {return jzName;}

    public void setJzName(String jzName) {
        this.jzName = jzName;
    }

    public String getFjName() {return fjName;}

    public void setFjName(String fjName) {
        this.fjName = fjName;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "fdj='" + fdj + '\'' +
                ", yc='" + yc + '\'' +
                ", num='" + num + '\'' +
                ", jzName='" + jzName + '\'' +
                ", fjName='" + fjName + '\'' +
                '}';
    }
}
