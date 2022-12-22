class Feast {
    canvas
    context
    gravity = -0.1
    fireworks = []
    subFireworks = []
    color_sys = "0123456789abcdef"
    colors_lenght = this.color_sys.length
    animationDuration
    animationDurationStart
    animationDurationEnd

    //Method
    getRandomColor() {
        return "#" + this.getRC() + this.getRC() + this.getRC()
    }

    animate(duration = true) {
        this.setAnimateDuration(duration)
        this.startAnimation()
        return this
    }


    runAnimation() {
        // update   
        // draw
    }

    checkAnimatinTimes() {
        if (this.animationDurationEnd === true || this.animationDurationEnd >= (new Date)) {
            return true;
        } else {
            return false;
        }
    }

    // Magic Method
    constructor(canvas) {
        this.init(canvas)
    }

    // components
    init(canvas) {
        this.canvas = document.getElementById(canvas)
        this.context = this.canvas.getContext("2d")
    }

    setAnimateDuration(duration) {
        duration = parseInt(duration)
        if (Number.isInteger(duration)) {
            this.animationDuration = duration
        } else {
            this.animationDuration = true
        }
        this.setAnimateTimes()
    }

    setAnimateTimes() {
        this.animationDurationStart = new Date()
        this.setAnimationEndTime()
    }

    setAnimationEndTime() {
        if (this.animationDuration === true) {
            this.animationDurationEnd = true
        } else {
            this.animationDurationEnd = new Date(this.animationDurationStart)
            this.animationDurationEnd.setMilliseconds(
                this.animationDuration + this.animationDurationEnd.getMilliseconds()
            )
        }
    }

    getRC() {
        return this.color_sys[Math.floor(
            Math.random() * this.colors_lenght
        )]
    }

    startAnimation() {
        this.runAnimation()
    }
}

class Firework {
    x
    y
    radius
    velocityX
    velocityY
    color
}

let animate = (runObj) => {
    if (runObj.checkAnimatinTimes()) {
        window.requestAnimationFrame(() => animate(runObj))
        runObj.runAnimation()
    }
}

let feast = new Feast("canvas")
console.log(feast)
animate(feast.animate('2000'))