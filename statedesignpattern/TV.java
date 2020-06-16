package statedesignpattern;

public class TV {
    private State state;
    private State homeState;
    private State netflixState;
    private State huluState;

    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHomeState(){
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }


}
