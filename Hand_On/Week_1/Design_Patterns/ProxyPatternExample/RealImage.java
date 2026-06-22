public class RealImage implements Image{
    String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadServer();
    }
    public void loadServer(){
        System.out.println("file is loaded from server: "+fileName);
    }
    @Override
    public void display(){
        System.out.println("Displaying Image: "+fileName);
    }
}
