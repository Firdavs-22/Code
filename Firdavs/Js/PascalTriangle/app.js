function createPascalTriangle(table, gen) {
    function getPascalTriangle(gen) {

        if (gen == 0) {
            return []
        }

        let triangle = [
            [1]
        ]

        for (let i = 1; i < gen; i++) {
            let prevRow = triangle[i - 1]
            let newRow = [1]

            for (let j = 1; j < i; j++) {
                newRow[j] = prevRow[j - 1] + prevRow[j]
            }
            newRow.push(1)

            triangle.push(newRow)

        }
        return triangle
    }

    function getTableTriangle(triangle) {
        let rowDiv
        let rows = []

        for (let row of triangle) {
            rowDiv = document.createElement('div')
            rowDiv.classList.add('row')

            for (let number of row) {
                let numberDiv = document.createElement('div')
                numberDiv.classList.add('number')
                numberDiv.textContent = number
                rowDiv.appendChild(numberDiv)
            }

            rows.push(rowDiv)
        }
        return rows
    }

    let triangle = document.getElementById(table)
    triangle.innerHTML = ''
    let pascalTriangle = getPascalTriangle(gen)
    for (let row of getTableTriangle(pascalTriangle)) {
        triangle.appendChild(row)
    }


}


createPascalTriangle('triangle', 3)


document.getElementById('createTriangle').addEventListener('click', () => {

    let rows = document.getElementById('rows').value
    createPascalTriangle('triangle', rows)

    window.scroll((document.body.scrollWidth - screen.width) / 2, 0)

});

