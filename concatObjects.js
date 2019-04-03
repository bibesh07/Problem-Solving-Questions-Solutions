//
Question: Given an array of Json objects join the objects having the same ids while removing the hasFiles and replacing the key with has_typeName

Example: 
Input: 
var objArr  =[ 
      {CurrentAppTestId: 8, hasFiles: false, typeName: 'Hook', platformId : 'Ios', simpleName: 'little'},
      {CurrentAppTestId: 2, hasFiles: true, typeName: 'Huxley', platformId: 'Ios', simpleName: 'tango'},
      {CurrentAppTestId: 2, hasFiles: false, typeName: 'Ranabhat', platformId: 'Ios', simpleName: 'tango'},
      {CurrentAppTestId: 3, hasFiles: true, typeName: 'Kc', platformId: 'Ios', simpleName: 'mango'},
      {CurrentAppTestId: 2, hasFiles: false, typeName: 'Garett', platformId: 'Ios', simpleName: 'tango'}
    ];
    
OutPut = [
  {"CurrentAppTestId":8,"platformId":"Ios","simpleName":"little","hasHook":false},
  {"CurrentAppTestId":2,"platformId":"Ios","simpleName":"tango","hasHuxley":true,"hasRanabhat":false,"hasGarett":false},
  {"CurrentAppTestId":3,"platformId":"Ios","simpleName":"mango","hasKc":true}
]
//

concatObjects = (objArr) => {
  var finalAns = [];
  new Set(objArr.map(x => x.CurrentAppTestId)).forEach(x => {
    let objWithSameId = objArr.filter(a => a.CurrentAppTestId == x);
    let newObj = {};
    Object.keys(objWithSameId[0]).forEach(x => {
      if (!['typeName', 'hasFiles'].includes(x)) {
        newObj[x] = objWithSameId[0][x];
      }
    });
    for(var i =0;i<objWithSameId.length;i++) {
      newObj['has'+ objWithSameId[i].typeName] = objWithSameId[i].hasFiles;  
     }
    finalAns.push(newObj);
  });
  
  return finalAns;
}
