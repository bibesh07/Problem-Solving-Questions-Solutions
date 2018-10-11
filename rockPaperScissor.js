#Popular childhood game (rock, paper, scissor) simplified using JSON and JS.

let choices = ['rock','paper','scissor'];

let winChart = {
  'rock': 'scissor',
  'scissor': 'paper',
  'paper': 'rock',
}
let userChoice = prompt("Choose rock, Scissor or paper");

if (choices.filter(x => x == userChoice).length) {
    let compChoice = choices[Math.floor(Math.random() * Math.floor(3))];
    console.log('You chose ' + userChoice + ' Comp Chose ' + compChoice + '\n' + selectWinner(userChoice, compChoice));

    function selectWinner(u, c) {
        if (u == c) return 'tie';
        if (winChart[u] == c) return 'You Win';
        return 'You Lose';
    }
} else {
  console.log('Please enter a valid option.');
}
