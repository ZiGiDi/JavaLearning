public class UnloadThread implements Runnable {
    private Ship ship;
    private DocStation[] docs;

    public UnloadThread(Ship ship, DocStation[] docs) {
        this.ship = ship;
        this.docs = docs;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public DocStation[] getDocs() {
        return docs;
    }

    public void setDocs(DocStation[] docs) {
        this.docs = docs;
    }



    public void unloading(){

//        for (;DocStation.getFreePort(docs)==null;){
//            try {
//                wait(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        DocStation port = DocStation.getFreePort(docs);
        port.setBusy(true);
        System.out.println("The Ship " + ship.getName()+" Arrived at "+port.getName());

        while (ship.getBoxCapacity() >0){
            ship.setBoxCapacity(ship.getBoxCapacity()-1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The Ship " + ship.getName()+" go out from "+ port.getName());
        port.setBusy(false);
        //notifyAll();
    }

    @Override
    public void run() {
        unloading();
    }
}
