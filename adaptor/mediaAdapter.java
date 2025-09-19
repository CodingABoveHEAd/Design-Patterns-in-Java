package adaptor;

class mediaAdapter implements mediaPlayer {
    AdvanceMediaplayer player=new AdvanceMediaplayer();

    public void play(String audiotype,String filename){
        if(audiotype.equalsIgnoreCase("mp4")){
            player.playmp4(filename);
        }
        else if(audiotype.equalsIgnoreCase("vlc")){
            player.playvlc(filename);
        }
    }
}

