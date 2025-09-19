package adaptor;

public class audioPlayer implements mediaPlayer {
    mediaAdapter adapter;
    public void play(String audiotype,String fileName){
        if (audiotype.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }else if(audiotype.equalsIgnoreCase("mp4")||audiotype.equalsIgnoreCase("vlc")){
            adapter=new mediaAdapter();
            adapter.play(audiotype,fileName);
        }
    }
}
