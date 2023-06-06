class Cars {
    private String model;
    private int v;
    

    public void setModel(String model){
        this.model=model;
    }

    public void setV(int v){
        this.v=v;
    }

   public void shift(String a) {
        if (a == "D")
            System.out.println(model+" Drive forward");
        else
            System.out.println(model+" Stop");
    }
}