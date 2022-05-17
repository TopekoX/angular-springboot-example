import { Component, OnInit } from '@angular/core';
import { Person } from 'src/app/model/person';
import { PersonService } from 'src/app/service/person.service';

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.css']
})
export class PersonListComponent implements OnInit {

  person: Person[] = [];

  constructor(private personService: PersonService) { }

  ngOnInit(): void {
    this.listPerson();
  }

  listPerson() {
    this.personService.getPersonLists().subscribe(
      data => {
        console.log("Person : " + JSON.stringify(data));
        this.person = data;
      }
    )
  }

}
