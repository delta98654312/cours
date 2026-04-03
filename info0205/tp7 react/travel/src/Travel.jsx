import Form from "./components/Form"
import FormRow from "./components/FormRow"
import Input from "./components/Input"
import Button from "./components/Button";

function Travel(){
    return (
        <div>
            <h1>Formulaire d'inscription</h1>
            <Form method="post" action="https://www.cyrilrabat.fr/test.php">
                <FormRow>
                    <Input label="test" name="email" width="4" type="email" autofocus></Input>
                    <Input label="test" name="telephone" width="4" type="telephone"></Input>
                </FormRow>
            </Form >

            <Button css="btn-primary" type="submit">Valider la réservation</Button>
        </div>
);
}


export default Travel;