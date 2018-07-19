# Problem-Solving-Questions-Solutions
Set of Problem solving questions and answeres
Q. Iterate through an object and print out the results.

A=> (solved in ts for ng-6)
  import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `<div *ngFor="let key of keys">
              {{key}} : {{obj[key]}}
            </div>`,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name = 'Angular 6';
  obj = {
    a: 'Apple',
    b: 'Ball',
    c: 'call',
    d: 'doll'
  }

  keys = Object.keys(this.obj);
}

