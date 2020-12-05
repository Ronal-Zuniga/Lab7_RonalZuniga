
import javax.swing.JProgressBar;

public class hiloAnalisis extends Thread{
    private JProgressBar pgb;
    private boolean vive;
    private boolean e1;
    private boolean e2;
    private boolean e3;
    private int v1;
    private int v2;
    private int v3;

    public hiloAnalisis(JProgressBar pgb, boolean e1, boolean e2, boolean e3, int v1, int v2, int v3) {
        this.pgb = pgb;
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        vive = true;
    }

    public JProgressBar getPgb() {
        return pgb;
    }

    public void setPgb(JProgressBar pgb) {
        this.pgb = pgb;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isE1() {
        return e1;
    }

    public void setE1(boolean e1) {
        this.e1 = e1;
    }

    public boolean isE2() {
        return e2;
    }

    public void setE2(boolean e2) {
        this.e2 = e2;
    }

    public boolean isE3() {
        return e3;
    }

    public void setE3(boolean e3) {
        this.e3 = e3;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public double getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }

    
    @Override
    public void run(){
        while(vive){
            if (e1) {
                pgb.setValue(0);
                pgb.setMaximum((int) Math.round(v1/100));
                for (int i = 0; i < pgb.getMaximum(); i++) {
                    pgb.setValue(i);
                    if (pgb.getValue() == pgb.getMaximum()) {
                        e1 = false;
                        pgb.setValue(0);
                    }
                }
            }
            if (e2) {
                pgb.setValue(0);
                pgb.setMaximum((int) Math.round(v2/100));
                for (int i = 0; i < pgb.getMaximum(); i++) {
                    pgb.setValue(i);
                    if (pgb.getValue() == pgb.getMaximum()) {
                        e2 = false;
                        pgb.setValue(0);
                    }
                }
            }
            if (e3) {
                pgb.setValue(0);
                pgb.setMaximum((int) Math.round(v3/100));
                for (int i = 0; i < pgb.getMaximum(); i++) {
                    pgb.setValue(i);
                    if (pgb.getValue() == pgb.getMaximum()) {
                        e3 = false;
                        pgb.setValue(0);
                    }
                }
            }
            if (e1 == false && e2 == false && e3 == false) {
                vive = false;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
