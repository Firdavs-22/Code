const profiles = new Map();

/*Map - an array or other iterable  object whose elements are key-value pairs.*/
profiles.set('twitter', '@adalovelace');
profiles.set('facebook', 'adalovelace');
profiles.set('googleplus', 'ada');

profiles.size; // 3
profiles.has('twitter'); // true
profiles.get('twitter'); // @adalovelace
profiles.delete('facebook');
profiles.has('facebook'); // false
profiles.get('facebook'); // undefined
/*for (const entry of profiles){
    console.log(entry);
}*/

/*But what makes maps really interesting is the possibility of using functions and objects as keys of the map,
and this is something that is not entirely possible using plain objects*/
const tests = new Map();
tests.set(() => 2 + 2, 4);
tests.set(() => 2 * 2, 4);
tests.set(() => 2 / 2, 1);

/*for (const entry of tests){
    console.log((entry[0]() === entry[1]) ? 'pass' : 'fail');
}*/

/*This prototype allows us to easily construct sets, which means lists with unique values:*/
const s = new Set([0, 1, 2, 3]);
s.add(3); // will not be added
s.size; // 4
s.delete(0);
s.has(0) // false

for (const entry of s){
    console.log(entry);
}
