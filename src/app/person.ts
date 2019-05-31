import { Address } from 'src/app/address';
import { Company } from 'src/app/company';

export interface Person{
    id: any;
    name: string;
    username: string;
    email: string;
    phone: string;
    website: string;
    address: Address;
    company: Company;
}