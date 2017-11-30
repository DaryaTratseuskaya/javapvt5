package by.itacademy.task6.Task1;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class Notebook extends Devices {

    private String purposeType;
    private String matrixType;
    private String diskType;
    private String diskCapacity;

    public String getPurposeType() {
        return purposeType;
    }

    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    @Override
    public String printProducer() {
        return super.printProducer();
    }
}
