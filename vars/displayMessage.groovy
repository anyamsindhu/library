class DisplayMessage implements CommandInterface{
    def call(String user = 'test user') {
        echo "hello ${user}"
    }
    def steps
    void setSteps(def steps){
        this.steps=steps
    }
    void execute()
    {

      steps.sh 'echo "in library"'
        steps.libraryResource('../resources/main.py')
        steps.findFiles('main.py')
    }

}