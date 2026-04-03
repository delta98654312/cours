function Form({ method, action, children }) {
  return (
    <form method={method} action={action}>
      {children}
    </form>
  );
}

export default Form;
