package poly.car0;

public class Driver {
    private K3Car k3Car; //인스턴스 변수 => 지금은 인스턴스가 없음
    private Model3Car model3Car; //추가

    //새로운 차가 등장할때마다 계속 추가해주어야함
    //역할과 구현을 분리하지 않았음

    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
