public class ComputadorBuilder {
    String motherboard;
    String cpu;
    String gpu;
    int ram;
    int storage;

    public ComputadorBuilder(String motherboard, String cpu) {
        this.motherboard = motherboard;
        this.cpu = cpu;
    }

    public ComputadorBuilder setGPU(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputadorBuilder setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputadorBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Computador build() {
        return new Computador(this);
    }
}
