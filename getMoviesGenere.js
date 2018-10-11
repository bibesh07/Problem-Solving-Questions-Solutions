//pulling generas of movie so that it can be listed into categories

//sample of JSON returned from API
let movies = [
    {adult: false, genere_ids:[2,4,6], id:1, name:'movie1'},
    {adult: false, genere_ids:[5,7], id:2, name:'movie2'},
    {adult: true, genere_ids:[3,10,8], id:3, name:'movie3'},
    {adult: true, genere_ids:[4,8,5,6], id:4, name:'movie4'},
    {adult: false, genere_ids:[9,3,2], id:5, name:'movie5'},
    {adult: true, genere_ids:[10,3,8], id:6, name:'movie6'},
    {adult: false, genere_ids:[9,3,2,5], id:7, name:'movie7'},
    {adult: true, genere_ids:[3,5,2,6], id:8, name:'movie8'},
    {adult: false, genere_ids:[6], id:9, name:'movie9'},
    {adult: true, genere_ids:[2,5,8], id:10, name:'movie10'},
];

//keys for generes
let genre_keys = {
    '1' : 'Horror',
    '2' : 'Action',
    '3' : 'Adventure',
    '4' : 'Comedy',
    '5' : 'Drama',
    '6' : 'Romantic',
    '7' : 'Sci-Fi',
    '8' : 'Animated',
    '9' : 'Documentry',
    '10' : 'Crime',
}

//get allgenres type without repatition
let allGeneres = Array.from(new Set([].concat.apply([], movies.map(m => m.genere_ids)))).sort();

//get genres to name without repetition. you can see that Horror movie is moving from the list because the api doesnt return any movies with genere id 1.
allGeneres.map(g => genre_keys[g]);
