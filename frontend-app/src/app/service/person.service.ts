import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Person } from '../model/person';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  private urlPerson = "http://localhost:8080/api/person";
  private urlJurusan = "http://localhost:8080/api/jurusan";

  constructor(private httpClient: HttpClient) { }

  getPersonLists(): Observable<Person[]> {
    return this.httpClient.get<GetResponsePerson>(this.urlPerson).pipe(
      map(response => response._embedded.person)
    );
  }

}

interface GetResponsePerson {
  _embedded: {
    person: Person[]
  }
}
