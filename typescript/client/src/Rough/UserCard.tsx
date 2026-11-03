interface Student {
  name: string;
  age?: number;
}

const UserCard = ({ name, age }: Student) => {
  return (
    <div>
      <h2>Name: {name}</h2>
      <p>Age: {age}</p>
    </div>
  );
};

export default UserCard;
