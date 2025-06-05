public class BinaryTreeArray12 {
    Mahasiswa12[] dataMahasiswa12;
    int idxLast;

    public BinaryTreeArray12() {
        this.dataMahasiswa12 = new Mahasiswa12[10];
    }

    void populateData (Mahasiswa12 dataMhs[], int idxLast) {
        this.dataMahasiswa12 = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa12[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa12[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
    void add(Mahasiswa12 data) {
    if (idxLast >= dataMahasiswa12.length - 1) {
        System.out.println("Array tree penuh!");
        return;
    }

    idxLast++;
    dataMahasiswa12[idxLast] = data;
}

    public void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast && dataMahasiswa12[idxStart] != null) {
        dataMahasiswa12[idxStart].tampilInformasi();
        traversePreOrder(2 * idxStart + 1);
        traversePreOrder(2 * idxStart + 2);
    }
}


}
