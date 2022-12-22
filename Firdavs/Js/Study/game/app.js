class MoveBlock{
    constructor(block,speed) {
        this.block = block
        this.speed = speed
        this.style = block.style
    }
    move(key){
        this.currentStyle = getComputedStyle(this.block)
        if (key == "arrowup" || key == "w"){
            this.moveTop()
        } else if (key == "arrowdown" || key == "s"){
            this.moveBottom()
        } else if (key == "arrowleft" || key == "a"){
            this.moveLeft()
        } else if (key == "arrowright" || key == "d"){
            this.moveRight()
        }
    }
    moveLeft(){
        this.style.left = (parseFloat(this.currentStyle.left) - this.speed)+"px"
    }
    moveRight(){
        this.style.left = (parseFloat(this.currentStyle.left) + this.speed)+"px"
    }
    moveTop(){
        this.style.top = (parseFloat(this.currentStyle.top) - this.speed)+"px"
    }
    moveBottom(){
        this.style.top = (parseFloat(this.currentStyle.top) + this.speed)+"px"
    }
    run(){
        document.onkeydown = e => {
            this.move(e.key.toLowerCase())
        }
    }
 }

const game = new MoveBlock(document.getElementById("block"),20)
game.run()
