const canvas = document.getElementById("canvas")
const ctx = canvas.getContext("2d")


let gravity = -0.1

let fireworks = []
let subFireworks = []
let getColor = () => {
    var hex_color_sys = "0123456789abcdef"
    var lenght_hex_color_sys = hex_color_sys.length

    return "#" + hex_color_sys[(Math.floor(Math.random() * lenght_hex_color_sys))] + hex_color_sys[(Math.floor(Math.random() * lenght_hex_color_sys))] + hex_color_sys[(Math.floor(Math.random() * lenght_hex_color_sys))]
}

class Fireworks {
    constructor(x, y, radius, velX, velY, color) {
        this.x = x
        this.y = y
        this.radius = radius
        this.velX = velX
        this.velY = velY
        this.color = color
        this.opacity = 1
    }

    update() {
        this.velY -= gravity
        this.x += this.velX
        this.y += this.velY
        this.opacity -= 0.006
        if (this.opacity < 0) this.opacity = 0
    }

    draw() {
        ctx.save()
        ctx.globalAlpha = this.opacity
        ctx.beginPath()
        ctx.arc(this.x, this.y, this.radius, 0, Math.PI * 2, false)
        ctx.fillStyle = this.color
        ctx.fill()
        ctx.closePath()
        ctx.restore()

    }
}



let initCount = 0
let maxInit = 1

let initDelay = 1000
let fireworkRadius = 5
let particleCount = 10
let speedMultplayer = 5

let createSubFireworks = (x, y, count, speedMultplayer) => {
    let created = 0
    let radians = (Math.PI * 2) / count

    while (created < count) {
        let firework = new Fireworks(
            x,
            y,
            fireworkRadius,
            Math.cos(radians * created) * Math.random() * speedMultplayer,
            Math.sin(radians * created) * Math.random() * speedMultplayer,
            getColor()
        )
        subFireworks.push(firework)
        created++
    }
}


let update = () => {
    ctx.fillStyle = "rgba(10,0,0,0.1)"
    ctx.fillRect(0, 0, canvas.width, canvas.height)
    if (initCount < maxInit) {
        let firework = new Fireworks(
            Math.random() * canvas.width,
            canvas.height + Math.random() * 70,
            fireworkRadius,
            3 * (Math.random() - 0.5), -12,
            getColor()
        )

        fireworks.push(firework)
        setTimeout(() => {
            initCount--
        }, initDelay);
        initCount++
    }
    fireworks.forEach((firework, i) => {
        if (firework.opacity < 0.1) {
            fireworks.splice(i, 1)
            createSubFireworks(
                firework.x,
                firework.y,
                particleCount,
                speedMultplayer
            )
        } else {
            firework.update()
        }
    })
    subFireworks.forEach((firework, i) => {
        if (firework.opacity < 0.1) {
            subFireworks.splice(i, 1)
        } else {
            firework.update()
        }
    })
}

let draw = () => {
    fireworks.forEach(firework => {
        firework.draw()
    })
    subFireworks.forEach(firework => {
        firework.draw()
    })
}


// let animate = () => {
//     requestAnimationFrame(animate)
//     update()
//     draw()
// }
// animate()

let animate = () => {
    update()
    draw()
}
setInterval(() => {
    animate()
}, 15);