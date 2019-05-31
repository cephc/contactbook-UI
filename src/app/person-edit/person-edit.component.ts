import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';
import { PersonService } from '../shared/person/person.service';
import { Person } from 'src/app/person'


@Component({
  selector: 'app-person-edit',
  templateUrl: './person-edit.component.html',
  styleUrls: ['./person-edit.component.css']
})
export class PersonEditComponent implements OnInit, OnDestroy {
  
  person: Person = {id: 0, name: '', username: '', email: '', phone: '', website: '', address: {street: '', suite: '', zipcode: '', city: '', geo: { lat: 0, lng: 0}}, company: {name: '', catchPhrase: '', bs: ''}}
  sub: Subscription;

  constructor(private route: ActivatedRoute,
    private router: Router,
    private personService: PersonService,) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      const id = params[`id`];
      if (id) {
        this.personService.get(id).subscribe((person: Person) => {
          if (person) {
            this.person = person;
          } else {
            console.log('Person Not Found...');
            this.gotoList();
          }
        });
      }
    });
  }

  ngOnDestroy(){
    this.sub.unsubscribe();
  }
  gotoList() {
    this.router.navigate(['/person-list'])
  }
  save(){
    this.personService.save(this.person).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }

  remove(){
    this.personService.remove(this.person.id).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }
}
